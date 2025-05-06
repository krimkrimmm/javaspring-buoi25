package vn.scrip.buoi25.controller.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        // Kiểm tra thông tin đăng nhập (ví dụ: kiểm tra cơ sở dữ liệu hoặc thông tin tạm thời)
        if ("admin".equals(username) && "password123".equals(password)) {
            // Nếu đăng nhập thành công
            Map<String, String> response = new HashMap<>();
            response.put("message", "Đăng nhập thành công!");
            return ResponseEntity.ok(response);
        } else {
            // Nếu đăng nhập thất bại
            Map<String, String> response = new HashMap<>();
            response.put("message", "Tên đăng nhập hoặc mật khẩu không chính xác.");
            return ResponseEntity.status(401).body(response); // 401 Unauthorized
        }
    }
}
