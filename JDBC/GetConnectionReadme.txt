�菇�}

Oracle��System�Őڑ����āA�ڑ����[�U�[���m�F�iOn SQL*Plus�j

SQL> select sid,username,osuser from v$session
  2  where username is not null;

       SID USERNAME                       OSUSER
---------- ------------------------------ ------------------------------
       131 SYSTEM                         TERA4069783\WP
       138 DBSNMP                         NT AUTHORITY\SYSTEM
       141 DBSNMP                         NT AUTHORITY\SYSTEM
       142 SYSMAN                         TERA4069783$
       143 SYSMAN                         TERA4069783$
       146 SYSMAN                         TERA4069783$
       147 SYSMAN                         TERA4069783$

7�s���I������܂����B



�r���Ŏ~�܂��Ă����JDBC�ڑ��v���O���������s�iOn Java�j

c:\Jsample\1001\JDBC>java GetCon
�ڑ�����
�������ܐڑ���


 
�~�܂��Ă錄�ɂ�����x�ڑ��`�F�b�N�iOn SQL*Plus�j
SQL> /

       SID USERNAME                       OSUSER
---------- ------------------------------ ------------------------------
       131 SYSTEM                         TERA4069783\WP
       133 SCOTT
       138 DBSNMP                         NT AUTHORITY\SYSTEM
       141 DBSNMP                         NT AUTHORITY\SYSTEM
       142 SYSMAN                         TERA4069783$
       143 SYSMAN                         TERA4069783$
       146 SYSMAN                         TERA4069783$
       147 SYSMAN                         TERA4069783$

8�s���I������܂����B

���x��scott������͂��B

�Ƃ߂Ă���Java�v���O���������s�B���������������Enter�������΃v���O�����ĊJ�B
c:\Jsample\1001\JDBC>java GetCon
�ڑ�����
�������ܐڑ���
kurekure
���� = kurekure
���� = 8����
�ؒf����


 
�ؒf���������̂ŁA�ڑ����ēx�`�F�b�N�B�iOn SQL*Plus�j
SQL> /

       SID USERNAME                       OSUSER
---------- ------------------------------ ------------------------------
       131 SYSTEM                         TERA4069783\WP
       138 DBSNMP                         NT AUTHORITY\SYSTEM
       141 DBSNMP                         NT AUTHORITY\SYSTEM
       142 SYSMAN                         TERA4069783$
       143 SYSMAN                         TERA4069783$
       146 SYSMAN                         TERA4069783$
       147 SYSMAN                         TERA4069783$

7�s���I������܂����B

���ꂢ��scott�������Ă���B

 
�쐬�̃q���g

����̗��K�̓|�C���g����B
��ڂ̓v���O�������~�߂Ă������ƁB��ڂ́A�ڑ��󋵂��m�F���邱�Ƃł��B

Java�̃v���O�������~�߂邽�߂ɁA�ȉ��̋L�q���g�p���܂��B
	BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("�������ܐڑ���");
				String b = a.readLine();
				System.out.printf("���� = %s%n���� = %d����%n", b, b.length());
			} catch(IOException b) {
				System.out.println("���̓G���[");
			}


BufferedReader��InputStreamReader�����łɎg�p�������Ƃ̂���N���X�ł����A������System.in�𗘗p���Ă܂��B����́A�V�X�e������̓��͂������Ƃ��܂��̂ŁA�R�}���h���C���̉�ʂŁA���͂��s��Ȃ�����v���O��������ɐi�s���܂���B

���̋L�q��Oracle�ւ̐ڑ��v���O�����̓K�؂Ȉʒu�ɋL�q���Ă��������B

�ڑ��󋵂̊m�F�ɂ́Av$session���Q�Ƃ��܂��B����͌��݂̐ڑ��󋵂��Q�Ƃł���r���[�ɂȂ�܂��B��̎��s��œ��͂���SQL�͈ȉ��̂悤�ɂȂ�܂��B

select sid,username,osuser from v$session
where username is not null;

�g�p���Ă����̐����͈ȉ��̂Ƃ���ł��B

��	����
SID	�Z�b�V��������ʂ��邽�߂̃��j�[�N��ID
USERNAME	Oracle�̃��[�U�[��
OSUSER	OS�ł̃��[�U�[��

 
