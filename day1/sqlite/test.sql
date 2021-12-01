
CREATE TABLE goo(a);
.import ../example.txt goo
SELECT SUM(a>prev) FROM (SELECT rowid, a, lag(a) OVER (ORDER BY rowid) as prev FROM goo);
