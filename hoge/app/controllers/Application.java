package controllers;

import java.util.*;

import play.*;
import play.mvc.*;

import models.*;

public class Application extends Controller {
    public static void index() {
    	String message = "ようこそ、play Frameworkへ!";
    	render(message);
    }

    public static void add(String name, String email) {
    	if ((name != null && !name.equals("")) ||
    		(email != null && !email.equals("")) ){
    		Address address = new Address(name, email);
    		address.save();
    	}

    	List<Address> addresses = Address.findAll();
    	render(addresses);
    }
}