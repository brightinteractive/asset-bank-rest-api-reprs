Asset Bank REST API Representations
===================================

POJOs used to transfer data to/from Asset Bank via its REST API.

Important
---------

It seems the annotations naming the variables in the response doesn't work as expected.

```Java
  @XmlElementWrapper
  @XmlElement(name = "attributes")
  public List<AttributeValueRepr> attributes;
```

The XML ignore this name. Until Novemeber 2024 the JSON also ignored this name. 
Now the JSON does use this name. Do not rename any variables or these annotations without testing both XML and JSON formats.

Prerequisites
-------------

* Java 11
* Maven 3

Installation
------------

To clone the repo:

    git clone git@github.com:brightinteractive/asset-bank-rest-api-reprs.git

To run the tests:

`mvn test`

To generate the library as a packaged jar:

`mvn install`
