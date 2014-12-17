namespace LibSystem1
{
    partial class AdminHomePage
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnmember = new System.Windows.Forms.Button();
            this.btnbooks = new System.Windows.Forms.Button();
            this.btnbooksissued = new System.Windows.Forms.Button();
            this.btnauthor = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnmember
            // 
            this.btnmember.Location = new System.Drawing.Point(245, 63);
            this.btnmember.Name = "btnmember";
            this.btnmember.Size = new System.Drawing.Size(189, 23);
            this.btnmember.TabIndex = 0;
            this.btnmember.Text = "Edit Member Details";
            this.btnmember.UseVisualStyleBackColor = true;
            this.btnmember.Click += new System.EventHandler(this.btnmember_Click);
            // 
            // btnbooks
            // 
            this.btnbooks.Location = new System.Drawing.Point(245, 125);
            this.btnbooks.Name = "btnbooks";
            this.btnbooks.Size = new System.Drawing.Size(189, 23);
            this.btnbooks.TabIndex = 1;
            this.btnbooks.Text = "Edit Books";
            this.btnbooks.UseVisualStyleBackColor = true;
            this.btnbooks.Click += new System.EventHandler(this.btnbooks_Click);
            // 
            // btnbooksissued
            // 
            this.btnbooksissued.Location = new System.Drawing.Point(245, 193);
            this.btnbooksissued.Name = "btnbooksissued";
            this.btnbooksissued.Size = new System.Drawing.Size(189, 23);
            this.btnbooksissued.TabIndex = 2;
            this.btnbooksissued.Text = "Edit Books Issued";
            this.btnbooksissued.UseVisualStyleBackColor = true;
            this.btnbooksissued.Click += new System.EventHandler(this.btnbooksissued_Click);
            // 
            // btnauthor
            // 
            this.btnauthor.Location = new System.Drawing.Point(245, 259);
            this.btnauthor.Name = "btnauthor";
            this.btnauthor.Size = new System.Drawing.Size(189, 23);
            this.btnauthor.TabIndex = 3;
            this.btnauthor.Text = "Edit Author";
            this.btnauthor.UseVisualStyleBackColor = true;
            this.btnauthor.Click += new System.EventHandler(this.btnauthor_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(245, 329);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(189, 23);
            this.button1.TabIndex = 4;
            this.button1.Text = "Admin/User Register";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // AdminHomePage
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(671, 536);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.btnauthor);
            this.Controls.Add(this.btnbooksissued);
            this.Controls.Add(this.btnbooks);
            this.Controls.Add(this.btnmember);
            this.Name = "AdminHomePage";
            this.Text = "AdminHomePage";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.AdminHomePage_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnmember;
        private System.Windows.Forms.Button btnbooks;
        private System.Windows.Forms.Button btnbooksissued;
        private System.Windows.Forms.Button btnauthor;
        private System.Windows.Forms.Button button1;

    }
}