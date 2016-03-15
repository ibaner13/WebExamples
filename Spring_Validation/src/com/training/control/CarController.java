package com.training.control;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class CarController {

	@RequestMapping("/")
	public String initApp() {
		return "index";
	}

	@Autowired
	private ModelAndView mdl;

	@Autowired
	private CarRental car;

	@RequestMapping(name = "/AddRequest", method = RequestMethod.GET)
	public ModelAndView initForm() {

		mdl.setViewName("CarRequest");
		mdl.addObject("command", car);

		return mdl;
	}

	@ModelAttribute("carType")
	public String[] types() {
		return new String[] { "Innova", "Indica A/C", "Indica Non A/C" };
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") CarRental cr, BindingResult result) {

		String nextSteps = "Welcome";
		if (result.hasErrors())

		{
			nextSteps = "CarRequest";
		}
		return nextSteps;

	}

	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("name") String name, Model mdl) {
		mdl.addAttribute("prevBooking", "Your Previous booking was on 12th March 2016");
		return "Welcome";
	}

}