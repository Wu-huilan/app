package com.whl.app.controller;

import com.whl.app.entity.Food;
import com.whl.app.entity.ResponseMessage;
import com.whl.app.entity.Shoppingcart;
import com.whl.app.service.FoodService;
import com.whl.app.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @Autowired
    private ShoppingService shoppingService;
    private ResponseMessage responseMessage;

    @RequestMapping("/add")
    public ResponseMessage add(@RequestBody Shoppingcart shoppingcart) {
        responseMessage = new ResponseMessage();
        int count = shoppingService.insert(shoppingcart);
        if(count == 1){
            List<Shoppingcart> list = shoppingService.findAllByOpenId(shoppingcart.getOpenId());
            responseMessage.setStatus("success");
            responseMessage.setMsg("加入购物车成功");
            responseMessage.setData(list);
        }else {
            responseMessage.setStatus("error");
            responseMessage.setMsg("加入购物车失败");
        }
        return responseMessage;
    }

    @RequestMapping("/all")
    public ResponseMessage all(String openId) {
        responseMessage = new ResponseMessage();
        List<Shoppingcart> list = shoppingService.findAllByOpenId(openId);
        responseMessage.setStatus("success");
        responseMessage.setMsg("得到购物车列表成功");
        responseMessage.setData(list);
        return responseMessage;
    }

    @RequestMapping("/update")
    public ResponseMessage update(@RequestBody Shoppingcart shoppingcart) {
        responseMessage = new ResponseMessage();
        if(shoppingcart.getCount() == 0){
            shoppingService.deleleShoppingById(shoppingcart.getShppingcartId());
            responseMessage.setStatus("success");
            responseMessage.setMsg("删除购物车项成功");
        }else {
            int count = shoppingService.updateShoppingById(shoppingcart);
            if(count == 1){
                responseMessage.setStatus("success");
                responseMessage.setMsg("修改购物车项成功");
            }else {
                responseMessage.setStatus("error");
                responseMessage.setMsg("修改购物车失败");
            }
        }

        return responseMessage;
    }

    @RequestMapping("/clearAll")
    public ResponseMessage clearAll(String openId) {
        responseMessage = new ResponseMessage();

        int count = shoppingService.clearAll(openId);

        if(count >= 1){
            responseMessage.setStatus("success");
            responseMessage.setMsg("删除购物车成功");
        }else {
            responseMessage.setStatus("error");
            responseMessage.setMsg("删除购物失败");
        }

        return responseMessage;
    }

}
