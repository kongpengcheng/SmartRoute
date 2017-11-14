# SmartRoute
《1》`首先需要在module 和app 的gradle 的defaultConfig中添加下面代码（ps：注解生成器中我需要每个模块的名字）`
 javaCompileOptions {
            annotationProcessorOptions {
                arguments = ["moduleName": project.name]
            }
        }
 《2》`其次需要在你需要的模块中添加两行依赖`
  compile 'com.kong.router:router:1.1.3'
    implementation project(':routermoudle')
    
----------
**路由实现的意义**
 1.在一些复杂的业务场景下（比如商城），灵活性比较强，很多功能都是运营人员动态配置的，比如下发一个活动页面，我们事先并不知道具体的目标页面，但如果事先做了约定，提前做好页面映射，便可以自由配置跳转。

随着业务量的增长，客户端必然随之膨胀，开发人员的工作量越来越大，比如64K问题，比如协作开发问题。App一般都会走向组件化、插件化的道路，而组件化、插件化的前提就是解耦，那么我们首先要做的就是解耦页面之间的依赖关系。

                        **路由实现的功能**
1.添加注解

> @Route("test")
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        SmartRouter.injectParams(this);
       
    }

 

2.实现页面跳转
```
SmartRouter.build("test").go(this);
```

3.实现页面跳转加回调

>  SmartRouter.build("test").callback(new RouteCallback() { // 添加结果回调
                    @Override
                    public void callback(RouteResult state, Uri uri, String message) {
                        if (state == RouteResult.SUCCEED) {
                            Toast.makeText(MainActivity.this, "succeed: " + uri.toString(), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "error: " + uri + ", " + message, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).go(this);








4.携带参数进行跳转

> Bundle bundle = new Bundle();
                bundle.putString("param", "this is message from mainactivity");
                SmartRouter.build("param").with(bundle).go(this);


5.拦截功能(ps:假如界面需要检测是否登录，如果没登录先跳转到登录界面，首先创建拦截器，其次需要拦截检测的类注解)
 **拦截调用**  
```
             SmartRouter.build("intercepted").addInterceptors("SampleInterceptor").go(this);

```
 **拦截取消**  
```        SmartRouter.build("intercepted").skipInterceptors("SampleInterceptor").go(this);
```
6.网页跳转原声app ，只需要拦截到uri手动给路由就ok
public class SchemeFilterActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri uri = getIntent().getData();
        if (uri != null) {
            if (!"router://filter".equals(uri.toString())) {
                SmartRouter.build(uri).go(this);
            }
            finish();
        }
    }
}

