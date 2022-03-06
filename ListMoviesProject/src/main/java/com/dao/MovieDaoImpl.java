package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.model.ShowMovie;

@Transactional
@Repository
@Service
public class MovieDaoImpl implements MovieDao{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Autowired
    private MovieDao MovieDAO;
	
	@SuppressWarnings("unchecked")
	@Override
    public List < ShowMovie > getShowMovie() {
    	System.out.println("inside MoviedaoImpl class inside list movie method ");
    	
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < ShowMovie > cq = cb.createQuery(ShowMovie.class);
        Root < ShowMovie > root = cq.from(ShowMovie.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List <ShowMovie> list=query.getResultList();
        return list;
    }
	
	
//	@Override
//	public ShowMovie getShowMovie(String name) {
//		System.out.println("inside MoviedaoImpl class inside get movie method ");
//        Session currentSession = sessionFactory.getCurrentSession();
//        ShowMovie movie = currentSession.get(ShowMovie.class, name);
//        CriteriaBuilder cb = currentSession.getCriteriaBuilder();
//        CriteriaQuery < ShowMovie > cq = cb.createQuery(ShowMovie.class);
//        Root < ShowMovie > root = cq.from(ShowMovie.class);
//        cq.select(root).where(cb.like(root.get("image"), name));
//        Query query = currentSession.createQuery(cq);
//        List <ShowMovie> list=query.getResultList();
//		return (ShowMovie) list;      
//        
//	}
	
//	@Override
//    public ShowMovie getMovies() {
//        Session currentSession = sessionFactory.getCurrentSession();
//		return null;
//        
//    }


	@Override
	public List<ShowMovie> getMovies(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < ShowMovie > cq = cb.createQuery(ShowMovie.class);
        Root < ShowMovie > root = cq.from(ShowMovie.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List <ShowMovie> list=query.getResultList();
        return list;
	}
}
