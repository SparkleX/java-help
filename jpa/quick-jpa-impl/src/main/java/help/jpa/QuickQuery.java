package help.jpa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.Query;
import javax.persistence.TemporalType;

public class QuickQuery implements Query {

	private String name;
	private Class resultClass;
	private String sql;

	public QuickQuery(String sql, Class resultClass) 
	{
		this.sql = sql;
		this.resultClass = resultClass;
		
	}

	public QuickQuery(String name) {
		this.name = name;
	}

	@Override
	public List getResultList() {
		return new ArrayList<>();
		
	}

	@Override
	public Object getSingleResult() {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public int executeUpdate() {
		throw new  RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public Query setMaxResults(int maxResult) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public int getMaxResults() {
		throw new  RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public Query setFirstResult(int startPosition) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public int getFirstResult() {
		throw new  RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public Query setHint(String hintName, Object value) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Map<String, Object> getHints() {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public <T> Query setParameter(Parameter<T> param, T value) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setParameter(Parameter<Calendar> param, Calendar value, TemporalType temporalType) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setParameter(Parameter<Date> param, Date value, TemporalType temporalType) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setParameter(String name, Object value) {
		System.out.println(name + " : " + value);
		return this;
		
	}

	@Override
	public Query setParameter(String name, Calendar value, TemporalType temporalType) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setParameter(String name, Date value, TemporalType temporalType) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setParameter(int position, Object value) 
	{
		System.out.println(position + " - " + value);
		return this;
	}

	@Override
	public Query setParameter(int position, Calendar value, TemporalType temporalType) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setParameter(int position, Date value, TemporalType temporalType) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Set<Parameter<?>> getParameters() 
	{
		HashSet rt =new HashSet();
		rt.add(new QuickParameter("itemCode"));
		rt.add(new QuickParameter("a"));
		return rt;
		
	}

	@Override
	public Parameter<?> getParameter(String name) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public <T> Parameter<T> getParameter(String name, Class<T> type) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Parameter<?> getParameter(int position) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public <T> Parameter<T> getParameter(int position, Class<T> type) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public boolean isBound(Parameter<?> param) {
		throw new  RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public <T> T getParameterValue(Parameter<T> param) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Object getParameterValue(String name) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Object getParameterValue(int position) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setFlushMode(FlushModeType flushMode) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public FlushModeType getFlushMode() {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public Query setLockMode(LockModeType lockMode) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public LockModeType getLockMode() {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

	@Override
	public <T> T unwrap(Class<T> cls) {
		throw new  RuntimeException("NOT IMPLEMENTED");
		
	}

}
