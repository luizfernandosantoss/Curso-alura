package org.casadocodigo.validation;

import org.casadocodigo.models.Produto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class
ProdutoValidation implements Validator {

    public void validate(Object target, Errors erroes){
        ValidationUtils.rejectIfEmpty(erroes,"titulo","field.required");
        ValidationUtils.rejectIfEmpty(erroes,"descricao","field.required");
        Produto produto = (Produto) target;
        if(produto.getPaginas() <= 0){
            erroes.rejectValue("paginas","field.required");
        }
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Produto.class.isAssignableFrom(clazz);
    }

}
