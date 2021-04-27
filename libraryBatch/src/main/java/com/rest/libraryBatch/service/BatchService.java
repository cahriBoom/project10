package com.rest.libraryBatch.service;

import java.util.List;

import com.rest.libraryBatch.beans.ClientBean;
import com.rest.libraryBatch.beans.ExemplaireBean;

public interface BatchService {

	List<ClientBean> listRetardataire();
	List<ExemplaireBean> listExemplaireRetard();
	List<ExemplaireBean> getExemplaireByUser(ClientBean client);
	void sendMail();

	
}

