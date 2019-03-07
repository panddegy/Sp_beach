
create table tbl_main(
    b_id number primary key,
    title nvarchar2(50) not null,
    subtitle nvarchar2(500),
    hotm number(2),
    topic nvarchar2(50),
    area nvarchar2(2),
    addr nvarchar2(200),
    tel nvarchar2(50),
    homepage nvarchar2(500),
    mapurl varchar2(4000),
    imgurl nvarchar2(100)
);

create table tbl_memo(
    m_id number primary key,
    b_id number,
    m_auth nvarchar2(10),
    m_date nvarchar2(10),
    m_memo nvarchar2(255),
    b_title nvarchar2(50)
);

alter table tbl_memo add m_grade number(2);

create view avgBeach
as
select avg(m_grade) as avgB , b_id as b_id from tbl_memo group by b_id;

alter table tbl_main modify area nvarchar2(5);

create table tbl_admin(
    admin_id nvarchar2(20) primary key,
    admin_pass nvarchar2(255)
);








