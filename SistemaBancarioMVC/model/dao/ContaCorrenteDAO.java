package br.edu.ufabc.SistemaBancarioMVC.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.edu.ufabc.SistemaBancarioMVC.model.entity.ContaCorrente;

@Repository
public interface ContaCorrenteDAO extends JpaRepository<ContaCorrente, Long>{

}
