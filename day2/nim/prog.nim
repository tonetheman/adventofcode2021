
import strutils

proc part1(filename: string) =
  let inf = open(filename)
  defer: inf.close()

  var
    x=0
    y=0
  while true:
    try:
      let line = inf.readLine()
      let data = line.split(" ")
      let val = data[1].parseInt()
      if "forward".cmpIgnoreCase(data[0])==0:
        x += val
      elif "up".cmpIgnoreCase(data[0])==0:
        y -= val
      elif "down".cmpIgnoreCase(data[0])==0:
        y += val
    except:
      break
  echo(x*y)



proc part2(filename: string) =
  let inf = open(filename)
  defer: inf.close()
  
  var
    x = 0
    y = 0
    aim = 0
  while true:
    try:
      let line = inf.readLine()
      let data = line.split(" ")
      let val = data[1].parseInt()
      if "forward".cmpIgnoreCase(data[0])==0:
        x += val
        y += (val*aim)
      elif "up".cmpIgnoreCase(data[0])==0:
        aim -= val
      elif "down".cmpIgnoreCase(data[0])==0:
        aim  += val
    except:
      break
  echo(x*y)


part1("../input.txt")
part2("../input.txt")


