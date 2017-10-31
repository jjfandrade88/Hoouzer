package com.hoouze.controler;

import javax.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 11151505593
 */
@Controller
@Transactional
    @RequestMapping("/cliente")
public class ClienteControler {
    @RequestMapping("/index")
   public String index (){
       return "index";
   }
    
    
}
