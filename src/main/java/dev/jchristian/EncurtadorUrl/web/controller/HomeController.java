package dev.jchristian.EncurtadorUrl.web.controller;

import dev.jchristian.EncurtadorUrl.domain.Service.ShortUrlService;
import dev.jchristian.EncurtadorUrl.domain.entity.ShortUrlEntity;
import dev.jchristian.EncurtadorUrl.domain.models.ShortUrlDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final ShortUrlService shortUrlService;

    public HomeController(ShortUrlService shortUrlService) {
        this.shortUrlService = shortUrlService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<ShortUrlDto> shortUrls = shortUrlService.findAllPublicShortUrls();
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl", "http://localhost:8080");
        return "index";
    }

}
