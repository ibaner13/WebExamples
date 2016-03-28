package com.training.cntrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.AdminDAO;
import com.training.daos.StudentDAO;
import com.training.daos.ToppersDAO;
import com.training.entity.Administrator;
import com.training.entity.Student;

@Controller
@SessionAttributes("command")
public class AdministratorController {

	@RequestMapping("/")
	public String initApp() {
		return "index";
	}

	@Autowired
	private ModelAndView mdl;

	@Autowired
	private Administrator admin;

	@Autowired
	private Student stud;

	@Autowired
	@Qualifier("adminDao")
	private AdminDAO adminsObj;

	@Autowired
	@Qualifier("studDao")
	private StudentDAO studObj;

	@Autowired
	@Qualifier("toppersDao")
	private ToppersDAO topObj;

	@RequestMapping(value = "/AdminLoginValidate", method = RequestMethod.GET)
	public ModelAndView loginForm() {
		mdl.setViewName("AdminLogin");
		mdl.addObject("command", admin);
		return mdl;
	}

	@RequestMapping(value = "/LoginForm", method = RequestMethod.POST)
	public ModelAndView showForm(@ModelAttribute("admins") Administrator adminObj) {
		if (adminsObj.find(adminObj.getUserName()) != null && adminObj.getPassWord().equals("banerjee")) {
			mdl.setViewName("LoginForm");
			mdl.addObject("command", stud);
		} else {
			mdl.setViewName("Error");
		}
		return mdl;
	}

	@RequestMapping(value = "/Success", method = RequestMethod.POST)
	public ModelAndView successPage(@ModelAttribute("studnt") Student studentObj) {
		System.out.println(studentObj);
		studentObj.setTotal(studentObj.calculate());
		studObj.add(studentObj);
		mdl.setViewName("Success");
		return mdl;
	}

	List<String> depts = null;

	public void departments() {
		depts = new ArrayList<String>();
		depts.add("CSE");
		depts.add("IT");
		depts.add("EEE");
		depts.add("ECE");
		depts.add("ME");
		depts.add("CHM");
		depts.add("CIVIL");
	}

	@ModelAttribute("dptmnts")
	public List<String> departmentType() {
		departments();
		return depts;
	}

	@RequestMapping(value = "/Visitor")
	public String deptList(Model model) {
		departments();
		model.addAttribute("deptlist", depts);
		return "Departments";
	}

	@RequestMapping(value = "/topperList/{deptName}", method = RequestMethod.GET)
	public String viewStudents(@PathVariable("deptName") String dept, Model model) {
		List<Student> slist = new ArrayList<Student>();
		slist = (List<Student>) topObj.getStudents(dept);
		model.addAttribute("student", slist);
		return "Display";
	}

}
