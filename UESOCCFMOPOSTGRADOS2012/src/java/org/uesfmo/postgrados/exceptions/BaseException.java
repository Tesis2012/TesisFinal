/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author benjamin
 */
@ApplicationException(rollback = true)
public class BaseException extends Exception{
}
