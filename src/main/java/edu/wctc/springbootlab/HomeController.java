package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/view-cart")
    public String showCartPage() {
        return "orders/cart";
    }

    @RequestMapping("/product/detail")
    public String showProductDetailPage() {
        return "catalog/product-detail";
    }

    @PostMapping("/place-order")
    public String showPlaceOrder() {
        return "index";
    }

    @RequestMapping("/search")
    public String redirectToGoogle() {
        return "redirect:https://www.google.com";
    }
}

