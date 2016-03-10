package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.owlike.genson.Genson;
import com.training.domains.Employee;

@Path("/simple")
public class SimpleResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "You have configured Rest successfully";
	}

	@GET
	@Path("/name")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee() {
		String empRep = null;
		Employee emp = new Employee(101, "Gaurav");
		Genson serializer = new Genson();
		empRep = serializer.serialize(emp);
		return empRep;
	}

	@POST
	@Path("/add")
	public String addEmployee(@FormParam("id") int empId, @FormParam("name") String empName) {
		String message = null;
		Employee emp = new Employee(empId, empName);
		message = emp.toString();
		return "One Employee with " + message + "Added";

	}

	@DELETE
	@Path("/delete/{empId}")
	public String deleteEmployee(@PathParam("empId") int empId) {
		return "One Employee with id : " + empId + "deleted";
	}

	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response findAllEmployees(@QueryParam("dept") String department) {

		HashMap<String, Employee> list = new HashMap<String, Employee>();
		list.put("HR", new Employee(101, "Ramesh"));
		list.put("IT", new Employee(102, "Rajesh"));
		list.put("AD", new Employee(103, "Rakesh"));
		Employee found = list.get(department);

		return Response.status(200).entity(found).build();

	}

}