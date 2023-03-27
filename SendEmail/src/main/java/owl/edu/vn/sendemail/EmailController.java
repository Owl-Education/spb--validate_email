package owl.edu.vn.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailValidator emailValidator;

    @GetMapping("/validate-email")
    public String validateEmail(@RequestParam String email) {
        if (emailValidator.isValidEmailAddress(email)) {
            return "Email is valid";
        } else {
            return "Email is invalid";
        }
    }
}
