package com.example.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.dao.PersonDAO;
import com.example.model.Person;

import io.dropwizard.hibernate.UnitOfWork;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/person")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class PersonResource {

    PersonDAO personDAO;

    public PersonResource(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GET
    @Timed
    @UnitOfWork
    public List<Person> getAll(){
        return personDAO.getAll();
    }

    @GET
    @Timed
    @Path("/{id}")
    @UnitOfWork
    public Person get(@PathParam("id") Integer id){
        return personDAO.findById(id);
    }

    @POST
    @Timed
    @UnitOfWork
    public Person add(@Valid Person person) {
        Person newPerson = personDAO.insert(person);

        return newPerson;
    }

    @PUT
    @Timed
    @Path("/{id}")
    @UnitOfWork
    public Person update(@PathParam("id") Integer id, @Valid Person person) {
        person = person.setId(id);
        personDAO.update(person);

        return person;
    }

    @DELETE
    @Timed
    @Path("/{id}")
    @UnitOfWork
    public void delete(@PathParam("id") Integer id) {
        personDAO.delete(personDAO.findById(id));
    }
}
