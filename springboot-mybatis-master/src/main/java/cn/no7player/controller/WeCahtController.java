package cn.no7player.controller;

import cn.no7player.service.AesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nfplus on 2017/11/14.
 */
@RequestMapping("/base")
@RestController
public class WeCahtController {

    @Autowired
    private AesService aesService;

    @RequestMapping("/robot")
    public String robot(@RequestParam("param") String param){

        return aesService.doAes(param);
    }

}
