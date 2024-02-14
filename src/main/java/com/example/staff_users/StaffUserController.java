package com.example.staff_users;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;


@Path("/api/v1/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StaffUserController {


    @Inject
    StaffUserRepository staffUserRepository;


    @GET
    @Path("/")
    public Response getAllStaffUsers() {
        List<StaffUser> staffUsers = staffUserRepository.findAllStaffUsers();
        return Response.ok(staffUsers).build();
    }

//    @GET
//    @Path("/{userId}")
//    public Response getStaffUserById(@PathParam("userId") UUID userId) {
//        Optional<StaffUser> staffUser = staffUserService.getStaffUserById(userId);
//        return staffUser.map(value -> Response.ok(value).build())
//                .orElse(Response.status(Response.Status.NOT_FOUND).build());
//    }
//
//    @POST
//    public Response saveStaffUser(StaffUser staffUser) {
//        StaffUser savedStaffUser = staffUserService.saveStaffUser(staffUser);
//        return Response.status(Response.Status.CREATED).entity(savedStaffUser).build();
//    }
//
//    @DELETE
//    @Path("/{userId}")
//    public Response deleteStaffUser(@PathParam("userId") UUID userId) {
//        staffUserService.deleteStaffUser(userId);
//        return Response.status(Response.Status.NO_CONTENT).build();
//    }
//
//    @GET
//    @Path("/byname/{name}")
//    public List<StaffUser> getStaffUsersByName(@PathParam("name") String name) {
//        return staffUserRepository.findByName(name);
//    }
//
//    @GET
//    @Path("/byusername/{username}")
//    public Response getStaffUserByUsername(@PathParam("username") String username) {
//        Optional<StaffUser> staffUser = staffUserRepository.findByUsername(username);
//        return staffUser.map(value -> Response.ok(value).build())
//                .orElse(Response.status(Response.Status.NOT_FOUND).build());
//    }
//
//    @GET
//    @Path("/bystatus/{status}")
//    public List<StaffUser> getStaffUsersByStatus(@PathParam("status") String status) {
//        return staffUserRepository.findByStatus(status);
//    }
//
//    @GET
//    @Path("/byaccesslevelandstatus/{accessLevel}/{status}")
//    public List<StaffUser> getStaffUsersByAccessLevelAndStatus(
//            @PathParam("accessLevel") String accessLevel, @PathParam("status") String status) {
//        return staffUserRepository.findByAccessLevelAndStatus(accessLevel, status);
//
//}
}