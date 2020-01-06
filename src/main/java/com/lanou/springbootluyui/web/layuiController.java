package com.lanou.springbootluyui.web;


import com.lanou.springbootluyui.bean.User;
import com.lanou.springbootluyui.dao.UseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class layuiController {
  @Autowired
   private UseDao useDao;


    /**
     * {
     *   "code": 0,
     *   "msg": "",
     *   "count": 1000,
     *   "data": [{}, {}]
     * }
     * @return
     */

@RequestMapping("/user")
  public Map<String,Object> queryAll(){
      Map<String,Object> map = new HashMap<>();
          List<User> list = useDao.queryAll();
          map.put("code",0);
          map.put("msg","");
          map.put("count",list.size());
          map.put("data",list);
          return map;
  }
}
