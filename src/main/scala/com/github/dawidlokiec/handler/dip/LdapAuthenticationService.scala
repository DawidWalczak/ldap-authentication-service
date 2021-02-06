package com.github.dawidlokiec.handler.dip

/**
 * Defines the functionalities of a LDAP authentication service.
 */
trait LdapAuthenticationService {

  /**
   * Authenticates an user.
   *
   * @param username the username.
   * @param password the user's password.
   * @return true if the user was successfully authenticated.
   */
  def authenticate(username: String, password: String): Boolean

}