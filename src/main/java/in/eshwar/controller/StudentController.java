package in.eshwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@GetMapping("/morning")
	public String morning(Model model) {
		model.addAttribute("msg", "Good Morning");
		return "index";
	}

	@GetMapping("/evining")
	public String evining(Model model) {
		model.addAttribute("msg", "Good evining");
		return "index";
	}

}
