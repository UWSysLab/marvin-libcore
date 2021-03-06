
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium, 
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All 
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the 
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
PURPOSE.  

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package org.w3c.domts.level2.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "setNamedItemNS(arg)" method for a 
 *    NamedNodeMap should add a node using its namespaceURI and localName given that
 *    there is no existing node with the same namespaceURI and localName in the map.
 *    
 *    Create an attr node with namespaceURI "http://www.nist.gov",qualifiedName
 *    "prefix:newAttr" and value "newValue".
 *    Invoke method setNamedItemNS(arg) on the map of the first "address"
 *    element where arg is identified by the namespaceURI and qualifiedName
 *    from above.  Method should return the newly added attr node.
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-F68D080">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-F68D080</a>
*/
public final class setNamedItemNS03 extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public setNamedItemNS03(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staffNS", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      String namespaceURI = "http://www.nist.gov";
      String qualifiedName = "prefix:newAttr";
      Document doc;
      Node arg;
      NodeList elementList;
      Node testAddress;
      NamedNodeMap attributes;
      Node retnode;
      String value;
      Node setNode;
      doc = (Document) load("staffNS", true);
      arg = doc.createAttributeNS(namespaceURI, qualifiedName);
      arg.setNodeValue("newValue");
      elementList = doc.getElementsByTagName("address");
      testAddress = elementList.item(0);
      attributes = testAddress.getAttributes();
      setNode = attributes.setNamedItemNS(arg);
      retnode = attributes.getNamedItemNS(namespaceURI, "newAttr");
      value = retnode.getNodeValue();
      assertEquals("throw_Equals", "newValue", value);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/setNamedItemNS03";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(setNamedItemNS03.class, args);
   }
}

