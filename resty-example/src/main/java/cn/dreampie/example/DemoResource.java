package cn.dreampie.example;

import cn.dreampie.core.route.annotation.GET;
import cn.dreampie.core.route.annotation.POST;
import cn.dreampie.core.route.base.Resource;
import cn.dreampie.util.Maper;

import java.util.Map;

/**
 * Created by ice on 14-12-29.
 */
public class DemoResource extends Resource {

  @GET("/demos/:name")
  public Map find(String name) {
    return Maper.of("k1", "v1,name:" + name, "k2", "v2");
  }

  @POST("/demos")
  public Demo save(Demo demo) {
    demo.save();
    return demo;
  }

}
