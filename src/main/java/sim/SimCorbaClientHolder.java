package sim;

/**
* sim/SimCorbaClientHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sim.idl
* Segunda-feira, 9 de Dezembro de 2013 18h12min27s BRT
*/

public final class SimCorbaClientHolder implements org.omg.CORBA.portable.Streamable
{
  public sim.SimCorbaClient value = null;

  public SimCorbaClientHolder ()
  {
  }

  public SimCorbaClientHolder (sim.SimCorbaClient initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sim.SimCorbaClientHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sim.SimCorbaClientHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sim.SimCorbaClientHelper.type ();
  }

}