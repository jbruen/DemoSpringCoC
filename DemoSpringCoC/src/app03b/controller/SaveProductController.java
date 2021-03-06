package app03b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import app03b.domain.Product;
import app03b.form.ProductForm;

public class SaveProductController implements Controller {
	
	private static final Log logger = LogFactory.getLog(SaveProductController.class);

	@Autowired
	Product saveProduct;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		logger.info("SaveProductController called");
        ProductForm productForm = new ProductForm();
        // populate action properties
        productForm.setName(
                request.getParameter("name"));
        productForm.setDescription(
                request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        // create model
        saveProduct.setName(productForm.getName());
        saveProduct.setDescription(productForm.getDescription());
        try {
        	saveProduct.setPrice(Float.parseFloat(
        			productForm.getPrice()));
        } catch (NumberFormatException e) {
        }

        // insert code to save Product

        return new ModelAndView("ProductDetails", "product", saveProduct);
	}


}
