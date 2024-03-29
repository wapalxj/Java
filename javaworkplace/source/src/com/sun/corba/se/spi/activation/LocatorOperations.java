package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/LocatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u112/7884/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, September 22, 2016 9:33:08 PM PDT
*/

public interface LocatorOperations 
{

  // Starts the server if it is not already running.
  com.sun.corba.se.spi.activation.LocatorPackage.ServerLocation locateServer(int serverId, String endPoint) throws NoSuchEndPoint, ServerNotRegistered, ServerHeldDown;

  // Starts the server if it is not already running.
  com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB locateServerForORB(int serverId, String orbId) throws InvalidORBid, ServerNotRegistered, ServerHeldDown;

  // get the port for the endpoint of the locator
  int getEndpoint(String endPointType) throws NoSuchEndPoint;

  // to pick a particular port type.
  int getServerPortForType(com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB location, String endPointType) throws NoSuchEndPoint;
} // interface LocatorOperations
