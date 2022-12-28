package com.vorsin.library.dao.mappers;

import com.vorsin.library.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("full_name"));
        person.setAge(resultSet.getInt("year_of_birth"));
        return person;
    }
}
