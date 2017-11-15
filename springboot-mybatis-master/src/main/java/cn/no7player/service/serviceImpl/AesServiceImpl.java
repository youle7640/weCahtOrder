package cn.no7player.service.serviceImpl;

import cn.no7player.service.AesService;
import cn.no7player.util.PostServer;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by nfplus on 2017/11/10.
 */
@Service
public class AesServiceImpl implements AesService{

    @Value("${tuling.apiKey}")
    private String apiKey;
    @Value("${tuling.tulingUrl}")
    private String tulingUrl;

    @Override
    public String doAes(String param) {
        //封装请求参数
        JSONObject json = new JSONObject();
        json.put("key", apiKey);
        json.put("info", param);
        json.put("userid", java.util.UUID.randomUUID().getLeastSignificantBits());
        //请求图灵api
        String result = PostServer.SendPost(json.toString(), tulingUrl);
        String text = JSON.parseObject(result).getString("text");
        String url = JSON.parseObject(result).getString("url");
        if (url != null){
            return text+ "" +url;
        }

        return text;
    }
}
