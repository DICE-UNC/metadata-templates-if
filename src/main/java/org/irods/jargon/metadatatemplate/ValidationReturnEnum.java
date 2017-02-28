package org.irods.jargon.metadatatemplate;

/**
 * 
 * Indicates the result of a call to <code>validate</code> this element's value.
 * 
 * @author rskarbez
 * 
*/

public enum ValidationReturnEnum {
	SUCCESS, VALUE_NOT_EQUAL, BAD_TYPE, VALUE_IS_REQUIRED, SINGLE_VALUE_LIST_PROVIDED, VALUE_NOT_IN_LIST, VALUE_NOT_IN_RANGE, REGEX_SYNTAX_ERROR, REGEX_FAILED, BAD_REF, NOT_VALIDATED
}
