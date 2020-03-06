package com.panda.api.domain.support;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.domain.Persistable;
 
import javax.persistence.*;
 
@MappedSuperclass
public abstract class Entities extends Auditable implements Persistable<Long> {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
 
    @Override
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
    @Override
    public boolean isNew() {
        return (this.id == null);
    }
}