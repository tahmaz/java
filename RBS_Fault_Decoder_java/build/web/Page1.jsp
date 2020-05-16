<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Aug 1, 2011, 11:28:30 AM
    Author     : tetahmaz
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Page1.page1}" id="page1">
            <webuijsf:html binding="#{Page1.html1}" id="html1">
                <webuijsf:head binding="#{Page1.head1}" id="head1">
                    <webuijsf:link binding="#{Page1.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Page1.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{Page1.form1}" id="form1">
                        <webuijsf:button actionExpression="#{Page1.button1_action}" binding="#{Page1.button1}" id="button1"
                            style="height: 17px; left: 287px; top: 24px; position: absolute; width: 67px" text="Axtar"/>
                        <webuijsf:textField binding="#{Page1.textField1}" columns="4" id="textField1" style="height: 24px; left: 192px; top: 24px; position: absolute; width: 24px"/>
                        <webuijsf:dropDown binding="#{Page1.dropDown1}" id="dropDown1" items="#{Page1.dropDown1DefaultOptions.options}" onChange="" style="height: 24px; left: 24px; top: 24px; position: absolute; width: 72px"/>
                        <webuijsf:table augmentTitle="false" binding="#{Page1.table1}" id="table1"
                            style="height: 77px; left: 24px; top: 72px; position: absolute" title="Table" width="672">
                            <webuijsf:tableRowGroup binding="#{Page1.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{Page1.faultdecoderDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{Page1.tableColumn5}" headerText="Fault Code" id="tableColumn5" sort="faultdecoder.Faultcode" width="104">
                                    <webuijsf:staticText binding="#{Page1.staticText7}" id="staticText7" text="#{currentRow.value['faultdecoder.Faultcode']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{Page1.tableColumn6}" headerText="Fault Name" id="tableColumn6" sort="faultdecoder.Faultname" width="95">
                                    <webuijsf:staticText binding="#{Page1.staticText8}" id="staticText8" text="#{currentRow.value['faultdecoder.Faultname']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{Page1.tableColumn7}" headerText="Related Faults" id="tableColumn7"
                                    sort="faultdecoder.Relatedfaults" width="121">
                                    <webuijsf:staticText binding="#{Page1.staticText9}" id="staticText9" text="#{currentRow.value['faultdecoder.Relatedfaults']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{Page1.tableColumn8}" headerText="Description" id="tableColumn8" sort="faultdecoder.Description">
                                    <webuijsf:staticText binding="#{Page1.staticText10}" id="staticText10" text="#{currentRow.value['faultdecoder.Description']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{Page1.tableColumn9}" headerText="Action" id="tableColumn9" sort="faultdecoder.Action">
                                    <webuijsf:staticText binding="#{Page1.staticText11}" id="staticText11" text="#{currentRow.value['faultdecoder.Action']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:dropDown binding="#{Page1.dropDown2}" id="dropDown2" items="#{Page1.dropDown2DefaultOptions.options}" style="height: 24px; left: 96px; top: 24px; position: absolute; width: 72px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
