package net.engineeringdigest.journalApp;
import net.engineeringdigest.journalApp.entities.InputRequest;
import net.engineeringdigest.journalApp.entities.OutputResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @PostMapping
    public OutputResponse processNumbers(@RequestBody InputRequest input) {
        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();
        boolean isNumericArray = true;

        List<String> numbers = input.getNumbers();
        if (numbers != null) {
            for (String element : numbers) {
                if (element.matches("\\d+")) {
                    int num = Integer.parseInt(element);
                    if (num % 2 == 0)
                        even.add(String.valueOf(num));
                    else
                        odd.add(String.valueOf(num));
                } else {
                    isNumericArray = false;
                }
            }
        } else {
            isNumericArray = false;
        }

        String userId = input.getFull_name().toLowerCase().replace(" ", "_") + "_" + input.getDob().replace("-", "");

        return new OutputResponse(userId, isNumericArray, odd, even);
    }

}
