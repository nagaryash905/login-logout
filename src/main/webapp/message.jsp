<% 
		String message=(String)session.getAttribute("msg");
		if(message!=null)
		{
			if(message.contains("SUCCESSFULLY"))
			{
				
%>
		<span style="color: green"><%=message%></span>
		
		<%
			}
			else
			{
			%>
			<span style="color: red"><%=message%></span>
			
			<%}%>
			
<%    }
		session.removeAttribute("msg");
%>