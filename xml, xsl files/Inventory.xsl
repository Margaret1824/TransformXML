<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/xhtml">
    <xsl:template match="/">
        <html xmlns="http://www.w3.org/1999/xhtml">
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
			<title>Inventory of Classic English Literature</title>
		</head>
            <body>
                <table border="1">
					<thead>
						<th>Classic English Literature</th>
					</thead>
					<xsl:for-each select="INVENTORY/CATEGORY">
					<tr>
						<td><xsl:value-of select="CATNAME"/></td>
					</tr>
					<tr>
					<td>
						<TABLE BORDER="0" CELLSPACING="10">
						   <THEAD>
							  <TH>Title</TH>
							  <TH>Author</TH>
							  <TH>Binding</TH>
							  <TH>Pages</TH>
							  <TH>Price</TH>
						   </THEAD>	
							<xsl:for-each select="../CATEGORY/BOOK">						   
						   <TR ALIGN="CENTER">
							  <TD><xsl:value-of select="TITLE"/></TD>
							  <TD><xsl:value-of select="AUTHOR"/></TD>
							  <TD><xsl:value-of select="BINDING"/></TD>
							  <TD><xsl:value-of select="PAGES"/></TD>
							  <TD><xsl:value-of select="PRICE"/></TD>
						   </TR>
						   </xsl:for-each>
						</TABLE>
					</td>
				    </tr>
				  </xsl:for-each>
			    </table>
			</body>
		</html>
    </xsl:template>
</xsl:stylesheet> 