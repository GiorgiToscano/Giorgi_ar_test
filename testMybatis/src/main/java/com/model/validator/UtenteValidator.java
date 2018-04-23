package com.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.testForm.UtenteForm;

@Component
public class UtenteValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return UtenteForm.class.equals(clazz);
	}

	public void validate(Object o, Errors e) {
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "nome", "blankname", "Il nome è un campo obbligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "cognome", "blankname", "Il cognome è un campo obbligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "username", "blankname", "L'username è un campo obbligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "password", "blankname", "La password è un campo obbligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "email", "blankname", "L'e-mail è un campo obbligatorio");
		UtenteForm uform = (UtenteForm) o;
		
		if (!CommonValiditation.isValidCodiceFiscale(uform.getCodiceFiscale()))
			e.rejectValue("codiceFiscale", "invalidcodfis", "Il codice fiscale è invalido");
		
		if (!CommonValiditation.isValidGiorgiEmail(uform.getEmail()))
			e.rejectValue("email", "invalidgiorgiemail", "L'email non soddisfa i criteri dell'e-mail Giorgi");
		
		if (!CommonValiditation.isValidPassword(uform.getPassword()))
			e.rejectValue("password", "invalidpassword", "La password deve essere di minimo 8 caratteri e avere almeno un numero");
		
		if (!uform.getPassword().equals(uform.getRipetiPassword()))
			e.rejectValue("ripetiPassword", "noequality", "Le due password non coincidono");
	}

}
