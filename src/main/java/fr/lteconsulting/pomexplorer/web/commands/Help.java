package fr.lteconsulting.pomexplorer.web.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Help
{
	String value() default "";
}
