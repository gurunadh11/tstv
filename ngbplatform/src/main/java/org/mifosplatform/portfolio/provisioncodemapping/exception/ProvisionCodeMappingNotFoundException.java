package org.mifosplatform.portfolio.provisioncodemapping.exception;

import org.mifosplatform.infrastructure.core.exception.AbstractPlatformResourceNotFoundException;

public class ProvisionCodeMappingNotFoundException  extends AbstractPlatformResourceNotFoundException {

	private static final long serialVersionUID = 1L;
	
	public ProvisionCodeMappingNotFoundException(Long id) {
		super("error.msg.product.id.not.found","product is Not Found",id);
		
	}

}
