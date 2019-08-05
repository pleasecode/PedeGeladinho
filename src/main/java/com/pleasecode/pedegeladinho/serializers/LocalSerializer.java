package com.pleasecode.pedegeladinho.serializers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import com.pleasecode.pedegeladinho.model.Local;

public class LocalSerializer extends StdSerializer<Local> {
	
	public LocalSerializer() {
        this(null);
    }

	protected LocalSerializer(Class<Local> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(Local local,
		      JsonGenerator generator, 
		      SerializerProvider provider)  throws IOException, JsonProcessingException {     
        	
        	generator.writeStartObject();
    		generator.writeNumberField("id", local.getId());
    		generator.writeStringField("nome", local.getNome());
    		generator.writeEndObject();
	}

}
