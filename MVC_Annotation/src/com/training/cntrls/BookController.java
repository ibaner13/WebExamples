package com.training.cntrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Book;

@Controller
@RequestMapping("/addBook.htm")
public class BookController {

	@Autowired
	private ModelAndView mdl;

	@Autowired
	private Book book;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initForm() {
		mdl.setViewName("AddBook");
		mdl.addObject("command", book);
		return mdl;

	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("bookObj") Book bk) {
		mdl.setViewName("Success");
		return mdl;

	}

}
