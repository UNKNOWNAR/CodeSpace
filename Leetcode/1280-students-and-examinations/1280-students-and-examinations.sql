# Write your MySQL query statement below
select st.student_id,st.student_name,sb.subject_name,count(e.subject_name) as attended_exams
from Students as st
cross join Subjects as sb
left join Examinations as e on e.subject_name = sb.subject_name and e.student_id = st.student_id
group by st.student_id, st.student_name,sb.subject_name 
order by st.student_id, sb.subject_name 