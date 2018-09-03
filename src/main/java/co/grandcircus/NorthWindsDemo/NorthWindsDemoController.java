package co.grandcircus.NorthWindsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.NorthWindsDemo.dao.SupplierDao;

@Controller
public class NorthWindsDemoController {
	
	@Autowired
	SupplierDao supplierdao;
	
	@RequestMapping("/")
	public ModelAndView showSuppliers() {
		ModelAndView mav = new ModelAndView("list-suppliers");
		
		mav.addObject("suppliers", supplierdao.findAll());

		return mav;
	}
}
