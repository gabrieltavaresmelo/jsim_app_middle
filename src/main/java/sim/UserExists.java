package sim;


/**
* sim/UserExists.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sim.idl
* Segunda-feira, 9 de Dezembro de 2013 18h12min27s BRT
*/

public final class UserExists extends org.omg.CORBA.UserException
{

  public UserExists ()
  {
    super(UserExistsHelper.id());
  } // ctor


  public UserExists (String $reason)
  {
    super(UserExistsHelper.id() + "  " + $reason);
  } // ctor

} // class UserExists
