package org.pointpowerservices.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.pointpowerservices.business.PointPowerBC;

@Path("/servicos")
public class PointPowerService {

	@GET
	@Path("/registra/{param}")
	public Response setRegistra(@PathParam("param") String registra){
		PointPowerBC controller = new PointPowerBC();
		controller.setRegistra(registra);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/registra")
	public Response getRegistra(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getRegistra()).build();

	}
	
	@GET
	@Path("/email/{param}")
	public Response setEmail(@PathParam("param") String email){
		PointPowerBC controller = new PointPowerBC();
		controller.setEmail(email);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/email")
	public Response getEmail(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getEmail()).build();

	}
	
	@GET
	@Path("/senha/{param}")
	public Response setSenha(@PathParam("param") String senha){
		PointPowerBC controller = new PointPowerBC();
		controller.setSenha(senha);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/senha")
	public Response getSenha(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getSenha()).build();

	}
	
	@GET
	@Path("/cpf/{param}")
	public Response setCPF(@PathParam("param") String cpf){
		PointPowerBC controller = new PointPowerBC();
		controller.setCpf(cpf);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/cpf")
	public Response getCPF(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getCpf()).build();

	}
	
	@GET
	@Path("/senharegistra/{param}")
	public Response setSenhaRegistra(@PathParam("param") String senharegistra){
		PointPowerBC controller = new PointPowerBC();
		controller.setSenhaRegistra(senharegistra);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/senharegistra")
	public Response getSenhaRegistra(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getSenhaRegistra()).build();

	}
	
	@GET
	@Path("/periodo/{param}")
	public Response setPeriodo(@PathParam("param") String periodo){
		PointPowerBC controller = new PointPowerBC();
		controller.setPeriodo(periodo);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/periodo")
	public Response getPeriodo(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getPeriodo()).build();

	}
	
	@GET
	@Path("/altera/{param}")
	public Response setAltera(@PathParam("param") String altera){
		PointPowerBC controller = new PointPowerBC();
		controller.setAltera(altera);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/altera")
	public Response getAltera(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getAltera()).build();

	}
	
	@GET
	@Path("/bate/{param}")
	public Response setBate(@PathParam("param") String bate){
		PointPowerBC controller = new PointPowerBC();
		controller.setBate(bate);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/bate")
	public Response getBate(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getBate()).build();

	}
	
	@GET
	@Path("/minuto/{param}")
	public Response setMinuto(@PathParam("param") String minuto){
		PointPowerBC controller = new PointPowerBC();
		controller.setMinuto(minuto);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/minuto")
	public Response getMinuto(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getMinuto()).build();

	}
	
	@GET
	@Path("/cap/{param}")
	public Response setCap(@PathParam("param") String cap){
		PointPowerBC controller = new PointPowerBC();
		controller.setCap(cap);
		String result = "OK";
		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("cap")
	public Response getCap(){
		PointPowerBC controller = new PointPowerBC();
		return Response.status(200).entity(controller.getCap()).build();

	}
}