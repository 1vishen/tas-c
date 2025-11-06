set script = CreateObject("Wscript.Shell")
Do
Wscript.Sleep(60*1000)
script.SendKeys("{SCROLLLOCK 2}")
Loop