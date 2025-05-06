package vn.scrip.buoi25.controller.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Value("${api.auth.login.url}")
    private String authApiUrl; // Địa chỉ API đăng nhập

    // Hiển thị trang đăng nhập
    @GetMapping("/dang-nhap")
    public String showLoginPage() {
        return "login"; // Trả về view login.html
    }

    // Xử lý đăng nhập
    @PostMapping("/dang-nhap")
    public String handleLogin(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Model model) {
        // Tạo payload cho API đăng nhập
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("username", username);
        requestBody.put("password", password);

        // Gọi API đăng nhập
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(authApiUrl, requestBody, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            // Nếu đăng nhập thành công, chuyển hướng đến trang chính hoặc trang người dùng
            return "redirect:/home"; // Thay đổi URL trang đích nếu cần
        } else {
            // Nếu đăng nhập thất bại, hiển thị thông báo lỗi
            model.addAttribute("error", "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin.");
            return "login"; // Quay lại trang đăng nhập
        }
    }
}
