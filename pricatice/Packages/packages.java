A package is grouping of related types( class, interface) provide access protection and name space management

A package is group of similar type class, interface and sub-packages


Advantage
 - categorized classes and interface ( logical grouping)
 - provides access protection
 - remove naming collision


 how to access
 1) import package *

   - import java.util.*  - all classes and interface but no sub package
   


  2) import package.classname

     - import java.util.Date



  3) FULLY QUALIFIED NAME

     - java.util.Date

// to import custom package it should be in same package


creating custom packages

   - all the mmeber should be public

   - need import keyword to import packge

   - unspecified - default PACKAGE SCOPE

   - protected = package scope + child classes



   to comple the package


    javac -d . ABC.java


    to run 


    java in.pune.ABC